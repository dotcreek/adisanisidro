/* Pestana_fauna
 *
 * Fist version 
 *
 * 08/5/2013
 * 
 *This software is the confidential and proprietary information of:
 *	Nixon Espinoza Matamoros. 
 *	Mauricio Jim�nez Guti�rrez.
 *	Jeudy Ram�rez Trejos. 
 */
package com.example.self_guidedtour;


import java.util.ArrayList;

import com.actionbarsherlock.app.SherlockActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;

/**
 * Class that contains the fauna object info, like add objects, and
 * her corresponding childrens or properties.
 * 
 * Calls the fragment or UI pestana_fauna.xml inside main_tabs
 * */
public class Pestana_fauna extends SherlockActivity{
	//set a variable mExpandableList to get the references
	private ExpandableListView mExpandableList;
	
	/**
	 * Create the UI interface and becomes to put objects
	 * inside the ExpandableList View, it depends in which 
	 * marker are the user, or zone in the map.
	 * */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pestana_fauna);
		
		mExpandableList = (ExpandableListView)findViewById(R.id.expandable_list);
		  
        ArrayList<Parent> arrayParents = new ArrayList<Parent>();
        ArrayList<String> arrayChildren = new ArrayList<String>();
 
        /**Here we set the object and her characteristics
         * but it depends in the marker name, the name are saved in
         * the static variable MARCADOR, in the Intro_Screen class.
         * */
        if(Intro_Screen.MARCADOR.equals("Stage 1: Coco Loco >>")) {
        	//first item in fauna
        	for (int i = 0; i < 4; i++){
                //for each "i" create a new Parent object to set the title and the children
                Parent parent = new Parent();
                parent.setTitle("Fauna1." + i); 
                arrayChildren = new ArrayList<String>();
                arrayChildren.add("Nombre Cient�fico: ");
                arrayChildren.add("Informaci�n del animal aqui...");
                arrayChildren.add("M�s informaci�n");
                arrayChildren.add("Galer�a");
                parent.setArrayChildren(arrayChildren);
        	
                //in this array we add the Parent object. We will use the arrayParents at the setAdapter
                arrayParents.add(parent);
        	}    
        }//if Intro_Screen.MARCADOR=Stage 1: Coco Loco >>
 
        if(Intro_Screen.MARCADOR.equals("Stage 2: Trapiche >>")) {
        	//first item in fauna
        	for (int i = 0; i < 4; i++){
                //for each "i" create a new Parent object to set the title and the children
                Parent parent = new Parent();
                parent.setTitle("Fauna2." + i);
                arrayChildren = new ArrayList<String>();
                arrayChildren.add("Nombre Cient�fico: ");
                arrayChildren.add("Informaci�n de la planta aqui...");
                arrayChildren.add("M�s informaci�n");
                arrayChildren.add("Galer�a");
                parent.setArrayChildren(arrayChildren);
                //in this array we add the Parent object. We will use the arrayParents at the setAdapter
                arrayParents.add(parent);
        	}    
        }//if Intro_Screen.MARCADOR=Stage 1: Coco Loco >>
        
        if(Intro_Screen.MARCADOR.equals("Stage 3: Platas Ornamentales >>")) {
        	for (int i = 0; i < 4; i++){
                //for each "i" create a new Parent object to set the title and the children
                Parent parent = new Parent();
                parent.setTitle("Fauna3." + i); 
                arrayChildren = new ArrayList<String>();
                arrayChildren.add("Nombre Cient�fico: ");
                arrayChildren.add("Informaci�n de la planta aqui...");
                arrayChildren.add("M�s informaci�n");
                arrayChildren.add("Galer�a");
                parent.setArrayChildren(arrayChildren);
                //in this array we add the Parent object. We will use the arrayParents at the setAdapter
                arrayParents.add(parent);
            }
        }//if Intro_Screen.MARCADOR=Stage 2: Trapiche >>
        
        if(Intro_Screen.MARCADOR.equals("Check out: Guarumo Tree >>")) {
        	for (int i = 0; i < 4; i++){
                //for each "i" create a new Parent object to set the title and the children
                Parent parent = new Parent();
                parent.setTitle("Fauna4." + i);
                arrayChildren = new ArrayList<String>();
                arrayChildren.add("Nombre Cient�fico: ");
                arrayChildren.add("Informaci�n de la planta aqui...");
                arrayChildren.add("M�s informaci�n");
                arrayChildren.add("Galer�a");
                parent.setArrayChildren(arrayChildren);
     
                //in this array we add the Parent object. We will use the arrayParents at the setAdapter
                arrayParents.add(parent);
            }
        }//if Intro_Screen.MARCADOR=Stage 2: Trapiche >>
        
        if(Intro_Screen.MARCADOR.equals("Stage 4: Poza >>")) {
        	for (int i = 0; i < 4; i++){
                //for each "i" create a new Parent object to set the title and the children
                Parent parent = new Parent();
                parent.setTitle("Fauna poza." + i);
                arrayChildren = new ArrayList<String>();
                arrayChildren.add("Nombre Cient�fico: ");
                arrayChildren.add("Informaci�n de la planta aqui...");
                arrayChildren.add("M�s informaci�n");
                arrayChildren.add("Galer�a");
                parent.setArrayChildren(arrayChildren);
                //in this array we add the Parent object. We will use the arrayParents at the setAdapter
                arrayParents.add(parent);
            }
        }//if Intro_Screen.MARCADOR=Stage 4: POza >>
        
        if(Intro_Screen.MARCADOR.equals("Stage 5: Colonia de Zompopas >>")) {
        	for (int i = 0; i < 4; i++){
                //for each "i" create a new Parent object to set the title and the children
                Parent parent = new Parent();
                parent.setTitle("Fauna5." + i); 
                arrayChildren = new ArrayList<String>();
                arrayChildren.add("Nombre Cient�fico: ");
                arrayChildren.add("Informaci�n de la planta aqui...");
                arrayChildren.add("M�s informaci�n");
                arrayChildren.add("Galer�a");
                parent.setArrayChildren(arrayChildren);
                //in this array we add the Parent object. We will use the arrayParents at the setAdapter
                arrayParents.add(parent);
            }
        }//if Intro_Screen.MARCADOR=Stage 2: Trapiche >>
        
        if(Intro_Screen.MARCADOR.equals("Stage 6: Medici�n de Aguas >>")) {
        	for (int i = 0; i < 4; i++){
                //for each "i" create a new Parent object to set the title and the children
                Parent parent = new Parent();
                parent.setTitle("Fauna6." + i);
                arrayChildren = new ArrayList<String>();
                arrayChildren.add("Nombre Cient�fico: ");
                arrayChildren.add("Informaci�n de la planta aqui...");
                arrayChildren.add("M�s informaci�n");
                arrayChildren.add("Galer�a");
                parent.setArrayChildren(arrayChildren);
                //in this array we add the Parent object. We will use the arrayParents at the setAdapter
                arrayParents.add(parent);
            }
        }//if Intro_Screen.MARCADOR=Stage 2: Trapiche >>
        
        if(Intro_Screen.MARCADOR.equals("Stage 7: Humedal >>")) {
        	for (int i = 0; i < 4; i++){
                //for each "i" create a new Parent object to set the title and the children
                Parent parent = new Parent();
                parent.setTitle("Fauna7." + i);
                arrayChildren = new ArrayList<String>();
                arrayChildren.add("Nombre Cient�fico: ");
                arrayChildren.add("Informaci�n de la planta aqui...");
                arrayChildren.add("M�s informaci�n");
                arrayChildren.add("Galer�a");
                parent.setArrayChildren(arrayChildren);
                //in this array we add the Parent object. We will use the arrayParents at the setAdapter
                arrayParents.add(parent);
            }
        }//if Intro_Screen.MARCADOR=Stage 2: Trapiche >>
        
        if(Intro_Screen.MARCADOR.equals("Stage 8: �rbol de Almendro >>")) {
        	for (int i = 0; i < 4; i++){
                //for each "i" create a new Parent object to set the title and the children
                Parent parent = new Parent();
                parent.setTitle("Fauna8." + i);    
                arrayChildren = new ArrayList<String>();
                arrayChildren.add("Nombre Cient�fico: ");
                arrayChildren.add("Informaci�n de la planta aqui...");
                arrayChildren.add("M�s informaci�n");
                arrayChildren.add("Galer�a");
                parent.setArrayChildren(arrayChildren);
                //in this array we add the Parent object. We will use the arrayParents at the setAdapter
                arrayParents.add(parent);
            }
        }//if Intro_Screen.MARCADOR=Stage 2: Trapiche >>
        
        if(Intro_Screen.MARCADOR.equals("Stage 9: �rbol Fruta de Pan >>")) {
        	for (int i = 0; i < 4; i++){
                //for each "i" create a new Parent object to set the title and the children
                Parent parent = new Parent();
                parent.setTitle("Fauna9." + i);
                arrayChildren = new ArrayList<String>();
                arrayChildren.add("Nombre Cient�fico: ");
                arrayChildren.add("Informaci�n de la planta aqui...");
                arrayChildren.add("M�s informaci�n");
                arrayChildren.add("Galer�a");
                parent.setArrayChildren(arrayChildren);
                //in this array we add the Parent object. We will use the arrayParents at the setAdapter
                arrayParents.add(parent);
            }
        }//if Intro_Screen.MARCADOR=Stage 2: Trapiche >>
 
        
        //sets the adapter that provides data to the list.
        mExpandableList.setAdapter(new ExListAdapter(this,arrayParents));
        
        mExpandableList.setOnChildClickListener(new OnChildClickListener() {
			
			@Override
			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
				// TODO Auto-generated method stub
				if(Intro_Screen.MARCADOR.equals("Stage 1: Coco Loco >>")) {
					
				}else {
				}
				return false;
			}
		});//onClickListener
	
	}//onCreate
}
