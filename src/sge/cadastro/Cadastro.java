package sge.cadastro;

import java.util.List;
import java.util.Map;

import sge.domain.TipoCadastro;
import sge.exception.SgeException;

public interface Cadastro {

  Map<String, String> informarCampos();
  
  void validar(Map<String, String> campos) throws SgeException;
  
  void salvar() throws SgeException;
  
  List<TipoCadastro> carregarLista() throws SgeException;

}
