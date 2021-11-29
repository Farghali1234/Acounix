package utilities;

import java.io.IOException;

public class ReadData {
	
	static public String SwitchName;
	static public String SwitchUserName;
	static public String SwitchPass;
	static public String SwitchUrl;
	
	static public String BKSName;
	static public String BKSUserName;
	static public String BKSPass;
	static public String BKSUrl;
	static public String BKSSHUName;
	static public String BKSSHPass;
	static public String BKDomainName;
	static public String BKDomainType;
	
	static public String PWFName;
	static public String PWFStartTime;
	static public String PWFEndTime;
	
	//creating object of ExcelUtils class
	static ExcelUtils excelUtils = new ExcelUtils();
    
    //using the Constants class values for excel file path 
    static String excelFilePath =Constants.Path_TestData+Constants.File_TestData;
	
    public void Read() throws IOException { 
        excelUtils.setExcelFile(excelFilePath,"Sheet1");
        
        //Get data related to Switch 
        SwitchName=excelUtils.getCellData(1,1);
        SwitchUserName=excelUtils.getCellData(2,1);
        SwitchPass=excelUtils.getCellData(3,1);
        SwitchUrl=excelUtils.getCellData(4,1);
        
        //Get data related to BK Server
        BKSName=excelUtils.getCellData(1,3);
        BKSUserName=excelUtils.getCellData(2,3);
        BKSPass=excelUtils.getCellData(3,3);
        BKSUrl=excelUtils.getCellData(4,3);
        BKSSHUName=excelUtils.getCellData(5,3);
        BKSSHPass=excelUtils.getCellData(6,3);
        BKDomainName=excelUtils.getCellData(7,3);
        BKDomainType=excelUtils.getCellData(8,3);
        
        //Get data related to AirGap WorkFlow
        PWFName=excelUtils.getCellData(1,5);
        PWFStartTime=excelUtils.getCellData(3,5);
        PWFEndTime=excelUtils.getCellData(5,5);
       
    }

}
