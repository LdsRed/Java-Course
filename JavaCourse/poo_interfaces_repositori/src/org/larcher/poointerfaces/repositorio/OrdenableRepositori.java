package org.larcher.poointerfaces.repositorio;

import org.larcher.poointerfaces.modelo.Cliente;
import java.util.*;
public interface OrdenableRepositori {
    List<Cliente> listar(String campo, String dir);
}
