package com.example.handlingformsubmission;

import com.example.handlingformsubmission.Mappers.AirlinesRowMapper;
import com.example.handlingformsubmission.model.Airline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BDservice {	
			
	@Autowired
    JdbcTemplate jdbcTemplate;
	
	public  List<usuario> getUsuario(){
		
			String sql="select * from USUARIO";
        List<usuario> query = jdbcTemplate.query(sql, new AirlinesRowMapper());
        query.forEach(item->System.out.println(item.getAirlineNameShort()));
        return query;
		
		
		
	}
			
	

}
