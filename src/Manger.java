import java.util.ArrayList;

public class Manger {
     public ArrayList<DomesticAnimal> Domestic=new ArrayList<>();
     public ArrayList<WildAnimal> Wild=new ArrayList<>();
     public ArrayList<DefenderAnimal> Defender=new ArrayList<>();
    public ArrayList<DomesticAnimal> AllDomestic=new ArrayList<>();
    public ArrayList<WildAnimal> AllWild=new ArrayList<>();
    public ArrayList<DefenderAnimal> AllDefender=new ArrayList<>();
    public ArrayList<Cage> Cage=new ArrayList<>();

    Bank bank=new Bank();
     public ArrayList<Labratory> labratory=new ArrayList<>();
    public ArrayList<Product> product=new ArrayList<>();

    void BuyAnimal(String name){

    }
    //
    //
    //



    void Turn(int n){
        for(int j=0;j<n;j++){
            for(int i=0;i<labratory.size();i++){
                if(labratory.get(i).Active){
                    labratory.get(i).setCurrentTime(labratory.get(i).getCurrentTime()-1);
                }
                if(labratory.get(i).getCurrentTime()==0){
                    // new product
                    //time ra be haman halat avvalie bargardan
                    //TODO
                }
            }
            //checking cage
            //TODO
            //ranoom walk and hadafman
            //TODO
            //tabee ghaza khordan
            //TODO
            //tabee kam kardan az jan heivanat  va mahsoolatbar asas zaman
            //TODO
            //tabee niaz be ghaza peida kardan heivanat bar asas joooneshoon
            //TODO
            //Tabe toolid mahsoul tavasot heivanat
            //TODO
            //Tabe barkhrd vahshi ba mahsool va ahli  vahsi ba sag  , gorbe ba mahsool
            //TODO
            
        }
    }
}
