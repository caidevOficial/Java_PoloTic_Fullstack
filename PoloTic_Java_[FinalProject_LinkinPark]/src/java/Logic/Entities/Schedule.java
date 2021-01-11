/*
 * Copyright (C) 2020 <FacuFalcone - CaidevOficial>
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
package Logic.Entities;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author FacuFalcone - CaidevOficial
 */
@Entity
public class Schedule implements Serializable {

    // Atributes
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_schedule;
    @Temporal(TemporalType.TIME)
    private Date timeFrom;
    @Temporal(TemporalType.TIME)
    private Date timeTo;

    /**
     * Reserves space in memory to build the entity.
     */
    public Schedule() {
    }

    public Schedule(int id_schedule, Date timeFrom, Date timeTo) {
        this.id_schedule = id_schedule;
        this.timeFrom = timeFrom;
        this.timeTo = timeTo;

    }

    /**
     * Gets the id of the entity.
     *
     * @return the id of the entity.
     */
    public int getId_schedule() {
        return id_schedule;
    }

    /**
     * Gets the start time of the entity.
     *
     * @return the start time.
     */
    public Date getTimeFrom() {
        return timeFrom;
    }

    public String getFormatTime(Date time) {
        DateFormat newFormat = new SimpleDateFormat("HH:mm");
        return newFormat.format(time);
    }

    /**
     * Gets the limit time of the entity.
     *
     * @return the limit time.
     */
    public Date getTimeTo() {
        return timeTo;
    }

    /**
     * Sets the id of the entity.
     *
     * @param id_schedule the id to set.
     */
    public void setId_schedule(int id_schedule) {
        if (id_schedule > 0) {
            this.id_schedule = id_schedule;
        }
    }

    /**
     * Sets the start time of the entity.
     *
     * @param timeFrom the start time to set.
     */
    public void setTimeFrom(Date timeFrom) {
        this.timeFrom = timeFrom;
    }

    /**
     * Sets the limit time of the entity.
     *
     * @param timeTo the limit time to set.
     */
    public void setTimeTo(Date timeTo) {
        this.timeTo = timeTo;
    }
}
