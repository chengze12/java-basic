package com.chengze;

public class RefernceAndPrimitive {
    public static void main(String[] args) {
        aboutParamTransporting();
        aboutDataSharing();
    }

    private static void aboutDataSharing() {
        int c = 10;
        int d = c;
        c++;
        d--;
        System.out.printf("c=%d, d=%d \n", c, d);

        int[] r = new int[] { 1, 2 };
        int[] s = r;
        r[0]++;
        s[1]++;
        System.out.printf("r={%d, %d} \n", r[0], r[1]);
        System.out.printf("s={%d, %d} \n", s[0], s[1]);
    }//manage with the same array, it is refernce

    private static void aboutParamTransporting() {
        int a = 1;
        int b = 2;
        swap(a, b);
        System.out.printf("a=%d, b=%d \n", a, b);
        int[] x = new int[] { 10, 20 };
        int[] y = new int[] { 30, 50 };
        x[0]++;
        //swap(x, y);
        System.out.printf("x={%d, %d} \n", x[0], x[1]);
        System.out.printf("y={%d, %d} \n", y[0], y[1]);
    }

//    private static void swap(int[] is, int[] js) {
//        int[] x = is;
//        is = js;
//        js = x;
//    }

    private static void swap(int i, int j) {
        int x = i;
        i = j;
        j = x;
    }

}

