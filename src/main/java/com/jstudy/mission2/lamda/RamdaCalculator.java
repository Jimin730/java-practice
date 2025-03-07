package com.jstudy.mission2.lamda;

public interface RamdaCalculator {

    @FunctionalInterface
    public interface Sum {
        int calSum(int a, int b);
    }

    @FunctionalInterface
    public interface Diff {
        int calDiff(int a, int b);
    }

    @FunctionalInterface
    public interface Mul {
        int calMul(int a, int b);
    }

    @FunctionalInterface
    public interface Div {
        int calDiv(int a, int b);
    }
}
