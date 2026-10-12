/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuradedatos2026;

/**
 *
 * @author puma_
 */
public class EstructuraDeDatos2026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Holaaa!");
        
        String name;
        name = "Mara";
        System.out.println(name);
        
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(5));
        System.out.println(name.length());
        
        for(int i=0; i<name.length();i++){
            System.out.println(name.charAt(i));
        }
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.equals("Mara"));
        System.out.println(name.equalsIgnoreCase("MaRa"));
     
        System.out.println("mara@gmail.com".indexOf("@"));
        System.out.println("mara@gmail.com".indexOf("."));
        System.out.println("fasdfafs.png".endsWith(".jpg") || "fasdfafs.png".endsWith(".png"));
        System.out.println("".isEmpty());//valida que el string este vacio
        System.out.println("".isBlank());//valida que este vacia y espacios en blanco 
        System.out.println("Conejo Bonito".replace("o", "e"));
        System.out.println("Conejo Bonito".replaceFirst("o", "c"));
        System.out.println("juanito".substring(3));
        System.out.println("juanito".substring(3,5));
        System.out.println("juanito".substring(-2));
         
        byte age;
        age = 20;
        System.out.println("Age: " + age);
        
        short year;
        year = 2026 ;
        System.out.println("Year: " + year);
        
        boolean hasDebt;
        hasDebt = true;
        System.out.println("She/He has debt: " + hasDebt);
        System.out.println(hasDebt != true);
        System.out.println(hasDebt == true);
        System.out.println(hasDebt == false);
        System.out.println(hasDebt != false);
        System.out.println("------");
        System.out.println(true && true && true);
        System.out.println(5>2 && 'a'=='a'&& 5.5!=2.5);
        
        
        int debt;
        debt = 25000;
        System.out.println("Debt: $" + debt );
        System.out.println(debt + 1000);
        System.out.println(debt - 1000);
        System.out.println(debt/2);
        System.out.println(debt * 1000);
        System.out.println(++debt);
        System.out.println(--debt);
        System.out.println(debt==2);
        System.out.println(debt>2);
        System.out.println(debt<2);
     
        char initial = 'H';
        char initial2 = 'M';
        
        System.out.println("Initial: " + initial);
        System.out.println(++initial);
        System.out.println(++initial);
        System.out.println(++initial);
        System.out.println(--initial);
        System.out.println(initial==initial2);
        System.out.println(initial<initial2);
        System.out.println(initial>initial2);
        
        float interestRate;
        interestRate = 0.1f;
        System.out.println("Interest Rate: " + interestRate);
        
        
        
        long num;
        num = 83762527221568L;
        System.out.println("Number: " + num);
        
        double price;
        price = 49.99;
        System.out.println("Price: $" + price);
        
      
    
    Producto producto1;
    
    producto1 = new Producto(
            1, 
            "Playera Maja Verde", 
            "PM01", 
            'M',
            (byte)2,
            (short)2026,
            100, 
            00.2f, 
            1500.00,
            true);
    
        System.out.println("Producto: " + producto1.getNombre());
        System.out.println("Precio:" + producto1.getPrecioUnitario());
     } 
    
}
