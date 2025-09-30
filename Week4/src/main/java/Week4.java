public class Week4 {
    public static int max2Int(int a, int b) {
        // Tim gia tri lon nhat cua hai so nguyen
        return Math.max(a, b);
    }

    public static int minArray (int[] array) {
        // Tim gia tri nho nhat cua 1 mang so nguyen
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) min = array[i];
        }
        return min;
    }

    public static String calculateBMI(double weight, double height){
        // Tinh BMI
        double BMI = weight / (height * height);
        if ( BMI < 18.5 ) return "Thiếu cân";
        if ( BMI <= 22.9) return "Bình thường";
        if ( BMI <= 24.9 ) return "Thừa cân";
        return "Béo phì";
    }
}
