package dreamworker.com;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Scanner {

    private long position;

    private long mark = -1;

    private RandomAccessFile randomAccessFile;

    public Scanner(RandomAccessFile randomAccessFile) {
        this.randomAccessFile = randomAccessFile;
    }

    public byte nextByte() throws IOException {
        position++;
        return this.randomAccessFile.readByte();
    }

    public int nextShort() throws IOException {
        byte[] bytes = new byte[2];
        this.randomAccessFile.read(bytes);
        this.position += 2;
        return (bytes[0] & 0xff) | ((bytes[1] << 8) & 0xff00);
    }

    public int nextInt() throws IOException {
        byte[] bytes = new byte[4];
        this.randomAccessFile.read(bytes);
        this.position += 4;
        return (bytes[0] & 0xff) | ((bytes[1] << 8) & 0xff00) | ((bytes[2] << 16) & 0xff0000) | ((bytes[3] << 24) & 0xff000000);
    }

    public byte[] nextBytes(int len) throws IOException {
        byte[] bytes = new byte[len];
        this.randomAccessFile.read(bytes);
        this.position += len;
        return bytes;
    }

    public void mark() {
        this.mark = this.position;
    }

    public void unmark() throws IOException {
        if (mark == -1) {
            return;
        }
        this.position = mark;
        this.randomAccessFile.seek(this.position);
    }

    public void seek(long pos) throws IOException {
        this.randomAccessFile.seek(pos);
        this.position = pos;
    }

    public long getPosition() {
        return position;
    }
}
