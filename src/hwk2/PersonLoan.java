

package hwk2;


public class PersonLoan extends Loan {
    
    private final double primeInt=0.035;
    public PersonLoan(){
        setInterest(primeInt + 0.02);
    }

    
       
}
