/* pour la java doc : C:\Users\33666\Documents\NetBeansProjects\tp1exos2\dist\javadoc\index.html
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1exos2;

import java.util.Scanner;



/**
 *
 * @author 33666
 * class test étudiant ou se trouve le main
 */
public class TestEtudiant {
    
    public static void main(String args[]) 
    {
        
       //etudiant 1
        /**
 * Test pour étudiant 1 avec constucteur par defaur

 */
        
        Etudiant E1 = new Etudiant();
        System.out.println( "Par défaut tout est null:  son id est" +E1.getM_identifiant() +" son nom: " +E1.m_nom + E1.m_prenom );
         System.out.println("Par défaut le premier étudiant n'a rien de rempli");
         
                /**
 *
*allocation de E2 
*utilisation d'un tableau que l'utilisateur saisie en renseignant d'abord sa taille
* 
 */
         
         //Etudiant 2
         int taille; 
         float tab[] ;
         Scanner sc = new Scanner(System.in);
         System.out.println("Veuillez saisir le nombre que vous voulez saisir :");
         taille= sc.nextInt();
         tab= new float[taille];
         System.out.println("veuillez saisir " +taille +"notes. Veuillez entrez des nb positif");
         for (int j=0; j<taille; j++)
         {
          do{    
            tab[j]=sc.nextInt();
            }while (tab[j]<0);
         }
                 
         Etudiant E2= new Etudiant(taille, tab);
       
        String id;
        String nom;
        String prenom;
        
         System.out.println("Saissisez l'id du deusieme etudiant");
         id=sc.nextLine();
         
         System.out.println("Saissisez le nom du deusieme etudiant");
         nom=sc.nextLine();
          
         System.out.println("Saissisez le prenom du deusieme etudiant");
         prenom=sc.nextLine();
         
         E2.modifier(id, prenom, nom, taille, tab);
         
        //Afficher le tableau
         System.out.println("Voici les notes du deuxieme");
       // Etudiant E2 = new Etudiant (taille,tab );
        for (int i=0; i<E2.getM_taille() ; i++) 
        {
           System.out.println( +E2.getM_notes()[i]);
        }
        
        ///ETUDIANT 3
        /**
 *
*allocation de E3 rempli aleatoirement
* 
 */
      
        Etudiant E3= new Etudiant();
        E3.RemplirAleatoirement();
        System.out.println(" voisi l'étudiant E3 avec des notes aléatoire");
        E3.afficherTab();
        E3.tri();
        System.out.println(" E3 trier");
        E3.afficherTab();
        
        /**
 *
*utilisation de diverses fonction sur l'etudiant 2
 */
      
        E2.tri();
         System.out.println(" E2 trier");
        E2.afficherTab();
            System.out.println(" POur E2 on a:");
        E2.Moyenne();
        E2.maximum();
        E2.minimum();
        E2.Pourcentage();
        System.out.println("Quels notes voulez vous vérifiez si elle est présent dans le tab de note pour etudaint 2");
        
        boolean recherche;
       recherche= E2.find(sc.nextFloat());
       if (recherche==true) System.out.println("il est bien présent");
       else  System.out.println("il n'est pas présent");
           System.out.println(" notre chaine de la forme id/nom/prenom");
       E2.grandechaine();
        
    }
    
}
