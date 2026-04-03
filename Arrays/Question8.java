class Question8 {
    public static void main(String[] args) {
        String[] arr = {"Raj", "77", "101", "99", "Jio", "uuuu"};

        int numericCount = 0;
        int stringCount = 0;

        for (String str : arr) {
            if (str.matches("\\d+")) {
    numericCount++;
} else {
    stringCount++;
}
        }

        System.out.println("Numeric: " + numericCount);
        System.out.println("Strings: " + stringCount);
    }
}

