/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Aluno CA
 */
public class Sala {
    int ID;
    String Professor;
    String Materia;
    Sala(int id, String Professor, String Materia){
    if(ID < 0){
        System.out.println("Id invalido");
    }
    else{
        this.ID = ID;
    }
    this.Professor = Professor;
    this.Materia = Materia;
    }
    Sala(){
    
    }
    void AlterarMateria(String Materia){
        this.Materia = Materia;
    }
    String RecuperaMateria (){
        return this.Materia;
    }
    void AlterarID(int ID){
        this.ID = ID;
    }
     void AlterarProfessor (String Professor){
        this.Professor = Professor;
    }
    String RecuperaProfessor (){
        return this.Professor = Professor;
    }
    void ImprimeDados() {
        System.out.println("Professor: "+ Professor+"\n"
                + "Materia: "+ Materia+ "\n"
                        + "ID: " + ID);
    }
}
