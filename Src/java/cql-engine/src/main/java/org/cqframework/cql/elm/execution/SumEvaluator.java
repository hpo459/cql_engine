package org.cqframework.cql.elm.execution;

import org.cqframework.cql.execution.Context;
import org.cqframework.cql.runtime.Quantity;
import java.util.*;
import java.math.BigDecimal;

/*
* The Sum operator returns the sum of non-null elements in the source.
* If the source contains no non-null elements, null is returned.
* If the list is null, the result is null.
* Return types: Integer, BigDecimal & Quantity
*/

/**
* Created by Chris Schuler on 6/14/2016
*/
public class SumEvaluator extends Sum {

  public static Object sum(Object source) {
    if (source instanceof Iterable) {
      Iterable<Object> element = (Iterable<Object>)source;
      Iterator<Object> itr = element.iterator();

      if (!itr.hasNext()) { return null; } // empty list
      Object sum = itr.next();

      if (sum instanceof Integer) {
        while (itr.hasNext()) {
          sum = (Integer)sum + (Integer)itr.next();
        }
        return (Integer)sum;
      }
      else if (sum instanceof BigDecimal) {
        while (itr.hasNext()) {
          sum = ((BigDecimal)sum).add((BigDecimal)itr.next());
        }
        return (BigDecimal)sum;
      }
      else if (sum instanceof Quantity) {
        while (itr.hasNext()) {
          sum = (((Quantity)sum).getValue()).add((BigDecimal)itr.next());
        }
        return new Quantity().withValue(((Quantity)sum).getValue()).withUnit(((Quantity)sum).getUnit());
      }
      throw new IllegalArgumentException(String.format("Cannot Sum arguments of type '%s'.", sum.getClass().getName()));
    }
    else { return null; }
  }

  @Override
  public Object evaluate(Context context) {
    Object source = getSource().evaluate(context);
    if (source == null) { return null; }

    return sum(source);
  }
}
