package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        // 인스턴스 생성 방지
    }

    public static int sum(int[] sums) {
        int sum = 0;

        for (int i : sums) {
            sum += i;
        }

        return sum;
    }

    public static double average(int[] avgs) {
        return (double) sum(avgs) / avgs.length;
    }

    public static int min(int[] mins) {
        int min = mins[0];

        for (int i : mins) {
            if (i < min) {
                min = i;
            }
        }

        return min;
    }

    public static int max(int[] maxs) {
        int max = maxs[0];

        for (int i : maxs) { // 0번 인덱스부터 반복하기에 조금 효율성이 떨어질 수 있음 , 해결하려면 일반 for문을 이용
            if (i > max) {
                max = i;
            }
        }

        return max;
    }
}
