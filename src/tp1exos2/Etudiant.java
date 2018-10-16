/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1exos2;

import static java.time.Clock.system;
import java.util.Random;

/**
 *class correspondant à un etudiant
 * @author 33666
 */
public class Etudiant {


/**
 *
*attribut
 */
      
    private String m_identifiant;
    private float m_notes[];
    private int m_taille;
    String m_nom;
    String m_prenom;
    
    /**
 *
*constructeur par defaur
 */


    Etudiant() {
        m_identifiant = "";
        m_notes = null;
        m_taille = 0;
        m_nom = "";
        m_prenom = "";

    }
    
    /**
 *
*constructeur surchargé
 */


    Etudiant(int taille, float tab[]) 
    {      
        m_taille=taille;
        m_notes= new float[taille];
        for (int i = 0; i < taille; i++)
        {
        m_notes[i] = tab[i];
        }
    }
    /**
 *
*méthodes de test(modifier, moyenne et différents affichages */

    void modifier(String identifiant, String prenom, String nom, int taille, float tab[] )
    {
    
        setM_identifiant(identifiant);
        
        setM_taille(taille);
        m_nom = nom;
        m_prenom = prenom;
        
        for (int i=0; i<taille; i++)
        {
            getM_notes()[i]=tab[i];
        }
        
    }
    
    void afficherTab()
            
    {
        
    for (int i=0; i<m_taille;i++)
    {
        System.out.println(m_notes[i]);
    }
    
    }
    
    void RemplirAleatoirement()
            
    {   
        Random rand = new Random();
        int taille;
        m_taille=rand.nextInt(15);
        m_notes = new float[m_taille];
        for (int i=0; i<m_taille ;i++)
            
        {
           m_notes[i]=rand.nextInt(20);
          // (int)(Math.random() * 5)
        }
    }

void tri()
{
    float temp;
    
    for (int i=0; i<m_taille; i++)
    {
        for (int j=0; j<m_taille-1;j++)
        {
            if (m_notes[j]>m_notes[j+1])
            {
               temp= m_notes[j];
               m_notes[j]=m_notes[j+1];
               m_notes[j+1]=temp;
            }
        }
    }
}

void Moyenne()
{
    float somme=0;
    float moyenne=0;
    
    for(int i=0; i<m_taille; i++)
    {
        somme=somme+m_notes[i];
    }
    
    moyenne=somme/m_taille;
    
    System.out.println("la moyenne de l'élève est" +moyenne);    
    
    
}

void minimum()
{
    
    float min=m_notes[0];
    
    for (int i=0; i<m_taille; i++)
    {
        for (int j=0; j<m_taille-1;j++)
        {
            if (m_notes[j]<min)
            {
               min= m_notes[j];
               
            }
        }
    }
    
    System.out.println("le minimum est" +min);
    
}

void maximum()
{
    
    float max=0;
    
    for (int i=0; i<m_taille; i++)
    {
        for (int j=0; j<m_taille;j++)
        {
            if (m_notes[j]>max)
            {
               max= m_notes[j];
               
            }
        }
    }
    
    System.out.println("le maximum est" +max);
    
}

void Pourcentage()
{
    int moyenne=0;
    int cpt=0;
    for (int i=0; i<m_taille; i++)
    {
        if (m_notes[i]<8)
        {
            //moyenne=moyenne+m_notes[i];
            cpt++;
        }
    }
    cpt=cpt*100/m_taille;
    System.out.println("Le pourcentage de note en dessous de 8 est de " +cpt);
    
    cpt=0;
    
    
     for (int i=0; i<m_taille; i++)
    {
        if (m_notes[i]>=8 && m_notes[i]<=12)
        {
            //moyenne=moyenne+m_notes[i];
            cpt++;
        }
    }
    cpt=cpt*100/m_taille;
    System.out.println("Le pourcentage de note entre 8 ET 12 est de " +cpt);
    
    
       
    cpt=0;
    
    
     for (int i=0; i<m_taille; i++)
    {
        if (m_notes[i]>12)
        {
            //moyenne=moyenne+m_notes[i];
            cpt++;
        }
    }
    cpt=cpt*100/m_taille;
    System.out.println("Le pourcentage de note supérieur à 12 est de " +cpt);
    
}

boolean find (float nb)
{
    
    boolean test=false;

    for (int i=0; i<m_taille; i++)
    {
       if (m_notes[i]==nb)
         
       {
           test=true;
       }
    }
        return test;
    }

@Override
public String toString()
{
    
   return (m_identifiant + "/" + m_nom + "/" + m_prenom);
   
}

void grandechaine()
{
    String chaine=toString();
    System.out.println( chaine);
}


    /**
     *getters et setters pour attribut privé
     * @return the m_identifiant
     */
    public String getM_identifiant() {
        return m_identifiant;
    }

    /**
     * @param m_identifiant the m_identifiant to set
     */
    public void setM_identifiant(String m_identifiant) {
        this.m_identifiant = m_identifiant;
    }

    /**
     * @return the m_notes
     */
    public float[] getM_notes() {
        return m_notes;
    }

    /**
     * @param m_notes the m_notes to set
     */
    public void setM_notes(float[] m_notes) {
        this.m_notes = m_notes;
    }

    /**
     * @return the m_taille
     */
    public int getM_taille() {
        return m_taille;
    }

    /**
     * @param m_taille the m_taille to set
     */
    public void setM_taille(int m_taille) {
        this.m_taille = m_taille;
    }

}
    
    