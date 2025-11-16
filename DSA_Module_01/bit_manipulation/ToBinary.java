public class ToBinary {
    public static void main(String[] args) {
        int num = 8;
        System.out.println(convertToBinary(num));

    }
    public static String convertToBinary(int num){
        StringBuilder sb = new StringBuilder();
        while(num > 0){
            int reminder = num % 2;
            sb.append(reminder);
            num = num / 2;
        }
        sb.reverse();
        return sb.toString();
    }
    
}
