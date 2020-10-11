package edu.eci.cvds.sampleprj.dao.mybatis.mappers;

import edu.eci.cvds.sampleprj.dao.PersistenceException;
import edu.eci.cvds.samples.entities.Item;
import edu.eci.cvds.samples.entities.ItemRentado;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemRentadoMapper {
 
    public List<ItemRentado> consultarItemsRentados(@Param("idcli") long id);

    public List<ItemRentado> consultarItemRentados();

    public ItemRentado consultarItemRentado( @Param("idItem") int idItem );


}