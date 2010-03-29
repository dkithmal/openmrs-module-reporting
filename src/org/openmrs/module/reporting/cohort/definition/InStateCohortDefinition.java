package org.openmrs.module.reporting.cohort.definition;

import java.util.Date;
import java.util.List;

import org.openmrs.ProgramWorkflowState;
import org.openmrs.module.reporting.common.Localized;
import org.openmrs.module.reporting.definition.configuration.ConfigurationProperty;

/**
 * Query for whether the patient was in a state on a date or date range
 * (Using onDate is equivalent to setting onOrAfter==onOrBefore, but may be more efficient and readable
 */
@Localized("reporting.InStateCohortDefinition")
public class InStateCohortDefinition extends BaseCohortDefinition {

	private static final long serialVersionUID = 1L;

	@ConfigurationProperty(required=true, group="statesGroup")
	private List<ProgramWorkflowState> states;
	
	@ConfigurationProperty(group="dateRangeGroup")
	private Date onOrAfter;

	@ConfigurationProperty(group="dateRangeGroup")
	private Date onOrBefore;

	@ConfigurationProperty(group="onDateGroup")
	private Date onDate;

	/**
	 * Default constructor
	 */
	public InStateCohortDefinition() {
	}

	
    /**
     * @return the states
     */
    public List<ProgramWorkflowState> getStates() {
    	return states;
    }

	
    /**
     * @param states the states to set
     */
    public void setStates(List<ProgramWorkflowState> states) {
    	this.states = states;
    }

	
    /**
     * @return the onOrAfter
     */
    public Date getOnOrAfter() {
    	return onOrAfter;
    }

	
    /**
     * @param onOrAfter the onOrAfter to set
     */
    public void setOnOrAfter(Date onOrAfter) {
    	this.onOrAfter = onOrAfter;
    }

	
    /**
     * @return the onOrBefore
     */
    public Date getOnOrBefore() {
    	return onOrBefore;
    }

	
    /**
     * @param onOrBefore the onOrBefore to set
     */
    public void setOnOrBefore(Date onOrBefore) {
    	this.onOrBefore = onOrBefore;
    }

	
    /**
     * @return the onDate
     */
    public Date getOnDate() {
    	return onDate;
    }

	
    /**
     * @param onDate the onDate to set
     */
    public void setOnDate(Date onDate) {
    	this.onDate = onDate;
    }

	
}