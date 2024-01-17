
/**
 * The Calculator class is used for performing mathematical calculations.
 */
/**
 * The Calculator class provides methods for performing addition, subtraction, multiplication, and
 * division operations on two operands.
 */
class Calculator
{
    float addition( float operand_1,float operand_2){
        return(operand_1+operand_2);
    } 
    float subtraction( float operand_1,float operand_2){
        return(operand_1-operand_2);
    } 
    float multiplication( float operand_1,float operand_2){
        return(operand_1*operand_2);
    } 
    float division( float operand_1,float operand_2){
        return(operand_1/operand_2);
    } 
    public static void main(String[] args) {
        Calculator calc= new Calculator();
        float operand_1=10;
        float operand_2=5;

        float add_result=calc.addition(operand_1,operand_2);
    System.out.println("result is:"+add_result);

            float sub_result=calc.subtraction(operand_1,operand_2);
    System.out.println("result is:"+sub_result);

    float mul_result=calc.multiplication(operand_1,operand_2);
    System.out.println("result is:"+mul_result);

    float div_result=calc.division(operand_1,operand_2);
    System.out.println("result is:"+div_result);
    }
        
    }
