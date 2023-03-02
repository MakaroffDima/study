public class ToLine {
    int[][] data;

    public ToLine(int[][] data) {
        this.data = data;
    }

    int[] resize() {
        int[] res = new int[data.length * data[0].length];
        int start = 0;
        for (int[] data2 : data) {
            for (int j = 0; j < data2.length; j++) {
                res[start + j] = data2[j];
            }
            start += data2.length;
        }
        return res;
    }
}
