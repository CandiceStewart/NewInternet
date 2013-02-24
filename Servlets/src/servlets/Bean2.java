package servlets;

public class Bean2 {
	private String faulttype;
	private String faulttitle;
	private String faultdetail;
	private String faultstatus;
	private String faultfix;
	public boolean valid;
	
	public String getFaultType()
	{
		return faulttype;
	}	
	public void setFaultType(String newFaultType)
	{
		faulttype = newFaultType;
	}	
	public String getFaultTitle()
	{
		return faulttitle;	
	}	
	public void setFaultTitle(String newFaultTitle)
    {
        faulttitle = newFaultTitle;
    }
    public String getFaultDetail()
    {
        return faultdetail;
    }
    public void setFaultDetail(String newFaultDetail)
    {
        faultdetail = newFaultDetail;
    }
    public String getFaultStatus()
    {
        return faultstatus;
    }
    public void setFaultStatus(String newFaultStatus)
    {
        faultstatus = newFaultStatus;
    }
    public String getFaultFix()
    {
        return faultfix;
    }
    public void setFaultFix(String newFaultFix)
    {
        faultfix = newFaultFix;
    }
    public boolean isValid()
    {
        return valid;
    }
    public void setValid(boolean newValid)
    {
        valid = newValid;
    }
}

