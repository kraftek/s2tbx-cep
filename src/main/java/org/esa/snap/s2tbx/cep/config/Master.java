package org.esa.snap.s2tbx.cep.config;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "master")
public class Master {
    private String share;
    private String waitTime;
    private String localFolder;

    public String getShare () { return share; }
    public void setShare (String share)
    {
        this.share = share;
    }
    public String getWaitTime ()
    {
        return waitTime;
    }
    public void setWaitTime (String waitTime)
    {
        this.waitTime = waitTime;
    }
    public String getLocalFolder ()
    {
        return localFolder;
    }
    public void setLocalFolder (String localFolder)
    {
        this.localFolder = localFolder;
    }

    @Override
    public String toString() {
        return "Master [share = " + share + ", waitTime = " + waitTime + ", localFolder = " + localFolder + "]";
    }
}