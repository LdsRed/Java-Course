package org.larcher.poointerfaces.repositorio;
import org.larcher.poointerfaces.modelo.*;
import java.util.*;
public interface CrudRepositori {
    List<Cliente> listar();
    Cliente getClienteByID(Integer id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(Integer id);


}
