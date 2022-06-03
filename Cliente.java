import java.util.ArrayList;
class Cliente {

  String nome;
  ArrayList<Conta> carteira = new ArrayList<Conta>();


  public void novaConta(Conta nova){
    this.carteira.add(nova);


    
  }

   
 }