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

package logic;

import java.util.List;
import logic.classes.Competitor;
import logic.classes.Pet;
import persistence.PersistenceController;

/**
 * @author FacuFalcone - CaidevOficial
 */
public class LogicController {
    
    PersistenceController PC = new PersistenceController();
    
    public boolean createCompetitor(Competitor compet1){
        boolean success = false;
        if(PC.createCompetitor(compet1)){
            success = true;
        }
        System.out.println("LC create:" + success);
        return success;
    }
    
    public List<Competitor> showCompetitors(){
    
        return PC.showCompetitors();
    }
    
    public boolean createPet(Pet thisNewPet){
        boolean success = false;
        if(PC.createPet(thisNewPet)){
            success = true;
        }
        return success;
    }
}
