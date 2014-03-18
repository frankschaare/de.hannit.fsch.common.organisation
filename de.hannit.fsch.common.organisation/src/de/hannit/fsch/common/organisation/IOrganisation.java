/**
 * 
 */
package de.hannit.fsch.common.organisation;

import java.util.TreeMap;

import de.hannit.fsch.common.mitarbeiter.Mitarbeiter;
import de.hannit.fsch.common.mitarbeiter.Team;


/**
 * @author fsch
 *
 */
public interface IOrganisation
{
public String getName();
public void setMitarbeiter(TreeMap<Integer, Mitarbeiter> mitarbeiter);
public TreeMap<String, Mitarbeiter> getMitarbeiterNachName();
public TreeMap<Integer, Mitarbeiter> getMitarbeiterNachPNR();
public TreeMap<Integer, Team> getTeams();
}
