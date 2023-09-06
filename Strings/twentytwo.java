class twentytwo {
    public static void main(String[] args) {
        String Str = "a1bb2c'4";
        int n = Str.length();
        StringBuilder StrBuil = new StringBuilder();
        char lastChar = ' ';
        int digit =0 ;
        int i=0;

        while(i<Str.length()) {
            char temp = Str.charAt(i);
            if(Character.isLetter(temp)) {
                StrBuil = StrBuil.append(temp);
                lastChar = temp;
                i++;
            } else if(Character.isDigit(temp)) {
                while(i<n && Character.isDigit(Str.charAt(i))) {
                    digit *= 10;
                    digit += Character.getNumericValue(Str.charAt(i));
                    i++;
                }
                while(digit>1) {
                    StrBuil = StrBuil.append(lastChar);
                    digit--;
                }
                digit=0;
            } else {
                StrBuil = StrBuil.append(temp);
                i++;
            }
        }

        System.out.println(StrBuil);
    }
}
