import java.util.*;

public class Database {
    
    private static HashMap<String,Integer> herdBook;

    //Database Constructor
    private Database(Scanner stdin) {

        Scanner 
            srcIn = new Scanner(System.in);
        
        String
            regNumber,
            mapName,
            string;

        Integer
            numIn,
            numOut;


    }


//method to print Map as Pedigree
public void printPedigree(){
    
    String[]
        animal,
        dam,
        matGrDm,
        matGrSr,
        sire,
        patGrDm,
        patGrSr;
        


    String
        regNum,
        name,
        born,
        classific,
        proof,
        dtrs,
        rcrds,
        aveMilk,
        avePer
        aveBF,
        exImp;
    
    System.out.println("Data for the animal");
    System.out.println("Registration Number: " + 'regNum');
    System.out.println("Name: " + 'name');
    System.out.println("Born: " + 'born');
    System.out.println("Classification" + 'classific');
    System.out.println("Proof Date: " + 'proof');
    System.out.println("Dtrs = " + 'dtrs' + " Records = " + 'rcrds');
    System.out.println("AveMilk = " + 'aveMilk' + " Ave% = " + 'avePer' + "AveBf = " + 'aveBF' + " ExImp = " + 'exImp');


//return outString;
}

public static void main(String[] args){

    Boolean
        moreInfo,
        noMoreInfo;

    Integer 
        currCount;

    String
        currRegNum,
        string;


    HashMap hB;

    Scanner
        inFile,
        stdin = new Scanner(System.in);



    herdBook = new HashMap<String,Integer>();
        
    moreInfo = true;
    while(stdin.hasNext() && moreInfo){
        currRegNum = stdin.next();
        
        boolean empty;
        
        if(currRegNum==null){
            empty = true;
            break;
        }
            ;
        else(herdBook.containsKey(currRegNum))
            System.out.println(currRegNum);
        
            
        
    }
    
        //herdBook.printPedigree();
        
        
}
}
