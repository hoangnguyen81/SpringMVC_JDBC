package com.laptrinhjavaweb.repository.impl;

import java.util.List;
import java.util.Map;
import java.util.stream.DoubleStream;

import com.laptrinhjavaweb.builder.BuildingSearchBuilder;
import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.repository.IBuildingRepository;
import org.apache.commons.lang.StringUtils;

public class BuildingRepository extends SimpleJpaRepository<BuildingEntity> implements IBuildingRepository {
    @Override
    public List<BuildingEntity> findAll(BuildingSearchBuilder builder, Map<String, Object> params) {
         StringBuilder where = new StringBuilder("");
        where = createBuilderCommon(where, params);
        return  this.findAll(where.toString());
    }

    private StringBuilder createBuilderCommon(StringBuilder where,Map<String, Object> params) {
        if(params != null && params.size() > 0){
            String[] keys = new String[params.size()];
            Object[] values = new Object[params.size()];
            int i = 0;
            for(Map.Entry<String,Object> item:params.entrySet()){
                keys[i] = item.getKey();
                values[i] = item.getValue();
                i++;
            }
            for(int t = 0; t < keys.length; i++){
                if(values[t] instanceof String){
                    if(StringUtils.isNotBlank(values[t].toString())){
                        where.append(" and b."+keys[t]+" like '%"+values[t]+"%'");
                    }

                }
                else if(values[t] instanceof Integer){
                    if(values[t] != null){
                        where.append(" and b."+keys[t]+" = '%"+values[t]+"%'");
                    }
                }
            }
        }
        return where;
    }

//	public List<BuildingEntity> findAll(){
//		StringBuilder sql = new StringBuilder("SELECT * FROM building b");
//		return this.findAll(sql.toString());
//}

}
