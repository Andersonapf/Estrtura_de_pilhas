package one.digitalinovation;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {

        this.refNoEntradaPilha = null;
    }
    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }
    public No top(){
        return refNoEntradaPilha;

    }

    public boolean isEmpty(){

//        if(refNoEntradaPilha == null){
//            return true;
//        }
//        return false;
        return refNoEntradaPilha == null ? true : false; //mesma função do metodo acima.
    }

    @Override
    public String toString(){

        String stringRetorno = "---------------------\n";
        stringRetorno += "Pilha\n";
        stringRetorno += "---------------------\n";

        No noAuxiiar = refNoEntradaPilha;

        while (true){
            if(noAuxiiar != null){
                stringRetorno += "[No{dado=" + noAuxiiar.getDado()  +"}]\n";
                noAuxiiar = noAuxiiar.getRefNo();
            }else{
                break;
            }

        }

        stringRetorno += "=====================\n";
        return  stringRetorno;

    }

}
