package africa.semicolon.deitelExercises.tddTest.chapter_6;

public class TableOfBinaryOctalAndHexadecimal {
    public static String convertDecimalToBinaryOrOctal(int decimal, int binaryOrOctal) {
        String binaryDigits = "";
        while(decimal >0){
            binaryDigits = decimal % binaryOrOctal +binaryDigits;
            decimal = decimal / binaryOrOctal;
        }
        return binaryDigits;
    }

    public static String convertDecimalToHexadecimal(int decimal, int hexadecimal) {
        String hexadecimalDigit = "";
        while (decimal >0){
            switch (decimal % hexadecimal){
                case 0,1,2,3,4,5,6,7,8,9: hexadecimalDigit = decimal % hexadecimal+hexadecimalDigit;
                        break;
                case 10 : hexadecimalDigit = 'A' + hexadecimalDigit;
                            break;
                case 11 : hexadecimalDigit = 'B' + hexadecimalDigit;
                    break;
                case 12 : hexadecimalDigit = 'C' + hexadecimalDigit;
                    break;
                case 13 : hexadecimalDigit = 'D' + hexadecimalDigit;
                    break;
                case 14 : hexadecimalDigit = 'E' + hexadecimalDigit;
                    break;
                case 15 : hexadecimalDigit = 'F' + hexadecimalDigit;
                    break;
            }
            decimal = decimal /hexadecimal;
        }
        return hexadecimalDigit;
    }
    public static String getTableHeader(){
        String header = """
        DecimalValue        BinaryEquivalent                OctalDecimal                    HexaDecimal                
              
                """;
        return header;
    }
    public static String getConvertedValues(int decimal){
        String values = """
         %d         %20s         %20s          %20s                
                """.formatted(decimal,convertDecimalToBinaryOrOctal(decimal,2),
                convertDecimalToBinaryOrOctal(decimal,8),convertDecimalToHexadecimal(decimal,16));
    return values;
    }

    public static void main(String[] args) {
        System.out.println(getTableHeader());
        for(int i=1; i<=256; i++)
            System.out.println(getConvertedValues(i));
    }
}
