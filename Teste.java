import java.util.Scanner;
class Teste {
  
  Cliente cliente = new Cliente();
  
  public void executar() {

        Conta conta = new Conta(1111);
        cliente.nome = "fulano";
        Conta c1 = new Conta(1001);
        Conta q1 = new Conta(2001);
    
        cliente.novaConta(c1);
        cliente.novaConta(q1);
       
        boolean a = false;
        int b = 0;
        float valor;
    
       Scanner scan = new Scanner(System.in);
        
        while(a==false){
        System.out.println("O que gostaria de fazer? \n1 DEBITAR \n 2 CREDIATR \n 3 TRANSFERIR \n 4 SAIR");
        b = scan.nextInt();
        if(b==1){
          System.out.println("Valor que você gostaria de debitar");
          valor = scan.nextFloat();
           if(valor > 0){
             c1.debitar(valor);
          
             }
          }
           else if(b==2){
              System.out.println("Valor que você gostaria de creditar");
              valor = scan.nextFloat();
               if(valor > 0){
                 c1.creditar(valor);
  
                 }
              }
             
           else if(b==3){
          System.out.println("Valor que você gostaria de transferr e a conta");
          valor = scan.nextFloat();
          
           if(valor > 0){
             c1.transferir(q1,valor);
            
             }
          }
          else if(b==4){
            a=true;
          }
          
        }
    
        System.out.println("\n\nRELATORIO  *******");
        System.out.println(cliente.nome + ": "+cliente.carteira.size() + "contas");
    
        int i=1;
        for(Conta temp:cliente.carteira){
          
          System.out.println(i++ + ") (RS)" + temp.getSaldo());
          
          }

    }
  }
      

      

  
  
