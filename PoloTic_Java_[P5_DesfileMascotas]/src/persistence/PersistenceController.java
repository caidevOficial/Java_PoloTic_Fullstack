/*
* Copyright (C) 2020 FacuFalcone - CaidevOficial
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package persistence;

import persistence.Pet.PetJpaController;
import persistence.Competitor.CompetitorJpaController;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logic.classes.Competitor;
import logic.classes.Pet;
import persistence.exceptions.NonexistentEntityException;

/**
 * @author FacuFalcone - CaidevOficial
 */
public class PersistenceController {
    
    CompetitorJpaController parti = new CompetitorJpaController();
    PetJpaController thisPet = new PetJpaController();
    
    public boolean createCompetitor(Competitor compet1){
        boolean success = false;
        try {
            parti.create(compet1);
            System.out.println("Participante cargado con exito.");
            success = true;
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al cargar participante [Persistence Controller].");
        }
        System.out.println("PC create:" + success);
        return success;
    }
    
    public void deleteCompetitor(int id){
        try {
            parti.destroy(id);
            System.out.println("Participante ID:" + id + " Borrado con exito.");
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al borrar participante ID: " + id);
        }
    }
    
    public boolean createPet(Pet thisNewPet){
        boolean success = false;
        try {
            thisPet.create(thisNewPet);
            System.out.println("Mascota cargada con exito.");
            success = true;
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al cargar Mascota [Persistence Controller].");
        }
        System.out.println("PC create Pet:" + success);
        return success;
    }
    
    public void deletePet(int id){
        try {
            thisPet.destroy(id);
            System.out.println("Mascota ID:" + id + " Borrada con exito.");
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al borrar Mascota ID: " + id);
        }
    }

    public List<Competitor> showCompetitors() {
        return parti.findParticipantEntities();
    }
}
