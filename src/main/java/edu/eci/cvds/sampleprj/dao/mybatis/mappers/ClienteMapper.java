package edu.eci.cvds.sampleprj.dao.mybatis.mappers;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.samples.entities.Cliente;

/**
 *
 * @author 2106913
 */
public interface ClienteMapper {

    /**
     *
     * @param id
     * @return
     */
    public Cliente consultarCliente(@Param("idcli") long id);
    /**
     * Registrar un nuevo item rentado asociado al cliente identificado
     * con 'idc' y relacionado con el item identificado con 'idi'
     * @param id
     * @param idit
     * @param fechainicio
     * @param fechafin
     */

    public void agregarItemRentadoACliente(@Param("idcli") int id,@Param("idit") int idit,
            @Param("fechainicio") Date fechainicio,
            @Param("fechafin") Date fechafin);

    /**
     * Consultar todos los clientes
     * @return 
     */
    public List<Cliente> consultarClientes();

    /** Metodo que se encarga de agregar un cliente
     * @param cli
     */
    public void agregarCliente(@Param("cli") Cliente cli);

    /** Metodo que dice que clientes fueron vetados
     * @return List<Cliente>
     */
    public List<Cliente> consultarClientesVetados();

    public void vetar(long docu, boolean estado);

}
