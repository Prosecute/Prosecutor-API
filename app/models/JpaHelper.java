package models;
///////////////////////////////////////////////////////////////////////////////
//
//Author: Jiri Fryc
//
//Licence: AGPL v3
//
//This file is part of template-api-rest-java-playframework, which is part of Prosecutor. 
///////////////////////////////////////////////////////////////////////////////


import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class JpaHelper {
        public static Object getSingleResultOrNull(Query query){
            List results = query.getResultList();
            if (results.isEmpty()) return null;
            else if (results.size() == 1) return results.get(0);
            throw new NonUniqueResultException();
        }
        public static <X>X getSingleResultOrNull(TypedQuery<X> query)
        {
            List<X> results = query.getResultList();
            if (results.isEmpty()) return null;
            else if (results.size() == 1) return results.get(0);
            throw new NonUniqueResultException();
        }
}
