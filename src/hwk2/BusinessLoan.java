
package hwk2;


public class BusinessLoan extends Loan {
    
    private double primeInt=0.035;
    public BusinessLoan(){
         setInterest(primeInt+ 0.01);
    }

    
}
