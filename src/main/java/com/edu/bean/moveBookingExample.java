package com.edu.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class moveBookingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public moveBookingExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andCartypeIsNull() {
            addCriterion("cartype is null");
            return (Criteria) this;
        }

        public Criteria andCartypeIsNotNull() {
            addCriterion("cartype is not null");
            return (Criteria) this;
        }

        public Criteria andCartypeEqualTo(String value) {
            addCriterion("cartype =", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotEqualTo(String value) {
            addCriterion("cartype <>", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeGreaterThan(String value) {
            addCriterion("cartype >", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeGreaterThanOrEqualTo(String value) {
            addCriterion("cartype >=", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLessThan(String value) {
            addCriterion("cartype <", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLessThanOrEqualTo(String value) {
            addCriterion("cartype <=", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLike(String value) {
            addCriterion("cartype like", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotLike(String value) {
            addCriterion("cartype not like", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeIn(List<String> values) {
            addCriterion("cartype in", values, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotIn(List<String> values) {
            addCriterion("cartype not in", values, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeBetween(String value1, String value2) {
            addCriterion("cartype between", value1, value2, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotBetween(String value1, String value2) {
            addCriterion("cartype not between", value1, value2, "cartype");
            return (Criteria) this;
        }

        public Criteria andMovedateIsNull() {
            addCriterion("movedate is null");
            return (Criteria) this;
        }

        public Criteria andMovedateIsNotNull() {
            addCriterion("movedate is not null");
            return (Criteria) this;
        }

        public Criteria andMovedateEqualTo(Date value) {
            addCriterionForJDBCDate("movedate =", value, "movedate");
            return (Criteria) this;
        }

        public Criteria andMovedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("movedate <>", value, "movedate");
            return (Criteria) this;
        }

        public Criteria andMovedateGreaterThan(Date value) {
            addCriterionForJDBCDate("movedate >", value, "movedate");
            return (Criteria) this;
        }

        public Criteria andMovedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("movedate >=", value, "movedate");
            return (Criteria) this;
        }

        public Criteria andMovedateLessThan(Date value) {
            addCriterionForJDBCDate("movedate <", value, "movedate");
            return (Criteria) this;
        }

        public Criteria andMovedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("movedate <=", value, "movedate");
            return (Criteria) this;
        }

        public Criteria andMovedateIn(List<Date> values) {
            addCriterionForJDBCDate("movedate in", values, "movedate");
            return (Criteria) this;
        }

        public Criteria andMovedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("movedate not in", values, "movedate");
            return (Criteria) this;
        }

        public Criteria andMovedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("movedate between", value1, value2, "movedate");
            return (Criteria) this;
        }

        public Criteria andMovedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("movedate not between", value1, value2, "movedate");
            return (Criteria) this;
        }

        public Criteria andContateIsNull() {
            addCriterion("contate is null");
            return (Criteria) this;
        }

        public Criteria andContateIsNotNull() {
            addCriterion("contate is not null");
            return (Criteria) this;
        }

        public Criteria andContateEqualTo(String value) {
            addCriterion("contate =", value, "contate");
            return (Criteria) this;
        }

        public Criteria andContateNotEqualTo(String value) {
            addCriterion("contate <>", value, "contate");
            return (Criteria) this;
        }

        public Criteria andContateGreaterThan(String value) {
            addCriterion("contate >", value, "contate");
            return (Criteria) this;
        }

        public Criteria andContateGreaterThanOrEqualTo(String value) {
            addCriterion("contate >=", value, "contate");
            return (Criteria) this;
        }

        public Criteria andContateLessThan(String value) {
            addCriterion("contate <", value, "contate");
            return (Criteria) this;
        }

        public Criteria andContateLessThanOrEqualTo(String value) {
            addCriterion("contate <=", value, "contate");
            return (Criteria) this;
        }

        public Criteria andContateLike(String value) {
            addCriterion("contate like", value, "contate");
            return (Criteria) this;
        }

        public Criteria andContateNotLike(String value) {
            addCriterion("contate not like", value, "contate");
            return (Criteria) this;
        }

        public Criteria andContateIn(List<String> values) {
            addCriterion("contate in", values, "contate");
            return (Criteria) this;
        }

        public Criteria andContateNotIn(List<String> values) {
            addCriterion("contate not in", values, "contate");
            return (Criteria) this;
        }

        public Criteria andContateBetween(String value1, String value2) {
            addCriterion("contate between", value1, value2, "contate");
            return (Criteria) this;
        }

        public Criteria andContateNotBetween(String value1, String value2) {
            addCriterion("contate not between", value1, value2, "contate");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andStausIsNull() {
            addCriterion("staus is null");
            return (Criteria) this;
        }

        public Criteria andStausIsNotNull() {
            addCriterion("staus is not null");
            return (Criteria) this;
        }

        public Criteria andStausEqualTo(Integer value) {
            addCriterion("staus =", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausNotEqualTo(Integer value) {
            addCriterion("staus <>", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausGreaterThan(Integer value) {
            addCriterion("staus >", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausGreaterThanOrEqualTo(Integer value) {
            addCriterion("staus >=", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausLessThan(Integer value) {
            addCriterion("staus <", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausLessThanOrEqualTo(Integer value) {
            addCriterion("staus <=", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausIn(List<Integer> values) {
            addCriterion("staus in", values, "staus");
            return (Criteria) this;
        }

        public Criteria andStausNotIn(List<Integer> values) {
            addCriterion("staus not in", values, "staus");
            return (Criteria) this;
        }

        public Criteria andStausBetween(Integer value1, Integer value2) {
            addCriterion("staus between", value1, value2, "staus");
            return (Criteria) this;
        }

        public Criteria andStausNotBetween(Integer value1, Integer value2) {
            addCriterion("staus not between", value1, value2, "staus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}