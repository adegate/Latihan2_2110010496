
package universitas;

public class mahasiswa {
    String nama;
    String npm;
    String prodi;
    
   String nama(){
        return this.nama;
    }
    String npm(){
        return this.npm;
    }
    String prodi(){
        return this.prodi;
    }
    
    mahasiswa (String nama , String npm , String prodi){
        this.nama = nama;
        this.npm = npm;
        this.prodi = prodi;
    }

    public String getNama(){
    return this.nama;
    }
    public String getNpm(){
    return this.npm;
    }
    public String getProdi(){
    return this.prodi;
    }

    public String setNama(){
    return this.nama;
    }
    public String setNpm(){
    return this.npm;
    }
    public String setProdi(){
    return this.prodi;
    }
}
