public class dateToBinary {
    public static String convertDateToBinary(String date){
        // Convert the date to a binary string
        String[] dateParts = date.split("-");
        for (int i = 0; i < dateParts.length; i++) {
            dateParts[i] = Integer.toBinaryString(Integer.parseInt(dateParts[i]));
        }
        return String.join("-", dateParts);
        }
        public static void main(String[] args) {
            String date = "2020-01-01";
            String binaryDate = convertDateToBinary(date);
        System.out.println(" Binary representation of date: " + binaryDate);
        
    }

    
}
