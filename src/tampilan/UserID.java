/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;

public class UserID {
    
    private static String txtid;
    private static String txtnm;
    
    static void setidTeknisi(String idTek)  {
        UserID.txtid = idTek;
    }
    
    public static String getidTeknisi()    {
        return txtid;
    }
    
    public static String setNamaTeknisi(String namaTeknisi)    {
        UserID.txtnm = namaTeknisi;
        return null;
    }
    
    public static String getnamaTeknisi()    {
        return txtnm;
    }
}
