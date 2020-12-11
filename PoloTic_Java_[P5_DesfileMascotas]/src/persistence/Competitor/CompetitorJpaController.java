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

package persistence.Competitor;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logic.classes.Competitor;
import persistence.exceptions.NonexistentEntityException;
import persistence.exceptions.PreexistingEntityException;

/**
 * @author FacuFalcone - CaidevOficial
 */
public class CompetitorJpaController implements Serializable {

    public CompetitorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public CompetitorJpaController(){
        emf = Persistence.createEntityManagerFactory("PoloTic_Java_P5_DesfileMascotas_PU");
    }
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Competitor participant)throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(participant);
            em.getTransaction().commit();
        }catch(Exception ex) {
             if (findParticipant(participant.getId()) != null) {
                throw new PreexistingEntityException("Participant " + participant + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Competitor participant) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            participant = em.merge(participant);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = participant.getId();
                if (findParticipant(id) == null) {
                    throw new NonexistentEntityException("The participant with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Competitor participant;
            try {
                participant = em.getReference(Competitor.class, id);
                participant.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The participant with id " + id + " no longer exists.", enfe);
            }
            em.remove(participant);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Competitor> findParticipantEntities() {
        return findParticipantEntities(true, -1, -1);
    }

    public List<Competitor> findParticipantEntities(int maxResults, int firstResult) {
        return findParticipantEntities(false, maxResults, firstResult);
    }

    private List<Competitor> findParticipantEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Competitor.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Competitor findParticipant(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Competitor.class, id);
        } finally {
            em.close();
        }
    }

    public int getParticipantCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Competitor> rt = cq.from(Competitor.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
}
