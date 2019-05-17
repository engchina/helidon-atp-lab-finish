package io.helidon.atp.lab.entity;

import java.util.ArrayList;
import java.util.List;

public class DeptExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DEPT
     *
     * @mbg.generated Thu May 16 21:51:42 EDT 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DEPT
     *
     * @mbg.generated Thu May 16 21:51:42 EDT 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DEPT
     *
     * @mbg.generated Thu May 16 21:51:42 EDT 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPT
     *
     * @mbg.generated Thu May 16 21:51:42 EDT 2019
     */
    public DeptExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPT
     *
     * @mbg.generated Thu May 16 21:51:42 EDT 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPT
     *
     * @mbg.generated Thu May 16 21:51:42 EDT 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPT
     *
     * @mbg.generated Thu May 16 21:51:42 EDT 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPT
     *
     * @mbg.generated Thu May 16 21:51:42 EDT 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPT
     *
     * @mbg.generated Thu May 16 21:51:42 EDT 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPT
     *
     * @mbg.generated Thu May 16 21:51:42 EDT 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPT
     *
     * @mbg.generated Thu May 16 21:51:42 EDT 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPT
     *
     * @mbg.generated Thu May 16 21:51:42 EDT 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPT
     *
     * @mbg.generated Thu May 16 21:51:42 EDT 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPT
     *
     * @mbg.generated Thu May 16 21:51:42 EDT 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DEPT
     *
     * @mbg.generated Thu May 16 21:51:42 EDT 2019
     */
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

        public Criteria andDeptnoIsNull() {
            addCriterion("DEPTNO is null");
            return (Criteria) this;
        }

        public Criteria andDeptnoIsNotNull() {
            addCriterion("DEPTNO is not null");
            return (Criteria) this;
        }

        public Criteria andDeptnoEqualTo(Short value) {
            addCriterion("DEPTNO =", value, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoNotEqualTo(Short value) {
            addCriterion("DEPTNO <>", value, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoGreaterThan(Short value) {
            addCriterion("DEPTNO >", value, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoGreaterThanOrEqualTo(Short value) {
            addCriterion("DEPTNO >=", value, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoLessThan(Short value) {
            addCriterion("DEPTNO <", value, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoLessThanOrEqualTo(Short value) {
            addCriterion("DEPTNO <=", value, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoIn(List<Short> values) {
            addCriterion("DEPTNO in", values, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoNotIn(List<Short> values) {
            addCriterion("DEPTNO not in", values, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoBetween(Short value1, Short value2) {
            addCriterion("DEPTNO between", value1, value2, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoNotBetween(Short value1, Short value2) {
            addCriterion("DEPTNO not between", value1, value2, "deptno");
            return (Criteria) this;
        }

        public Criteria andDnameIsNull() {
            addCriterion("DNAME is null");
            return (Criteria) this;
        }

        public Criteria andDnameIsNotNull() {
            addCriterion("DNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDnameEqualTo(String value) {
            addCriterion("DNAME =", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotEqualTo(String value) {
            addCriterion("DNAME <>", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameGreaterThan(String value) {
            addCriterion("DNAME >", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameGreaterThanOrEqualTo(String value) {
            addCriterion("DNAME >=", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLessThan(String value) {
            addCriterion("DNAME <", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLessThanOrEqualTo(String value) {
            addCriterion("DNAME <=", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLike(String value) {
            addCriterion("DNAME like", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotLike(String value) {
            addCriterion("DNAME not like", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameIn(List<String> values) {
            addCriterion("DNAME in", values, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotIn(List<String> values) {
            addCriterion("DNAME not in", values, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameBetween(String value1, String value2) {
            addCriterion("DNAME between", value1, value2, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotBetween(String value1, String value2) {
            addCriterion("DNAME not between", value1, value2, "dname");
            return (Criteria) this;
        }

        public Criteria andLocIsNull() {
            addCriterion("LOC is null");
            return (Criteria) this;
        }

        public Criteria andLocIsNotNull() {
            addCriterion("LOC is not null");
            return (Criteria) this;
        }

        public Criteria andLocEqualTo(String value) {
            addCriterion("LOC =", value, "loc");
            return (Criteria) this;
        }

        public Criteria andLocNotEqualTo(String value) {
            addCriterion("LOC <>", value, "loc");
            return (Criteria) this;
        }

        public Criteria andLocGreaterThan(String value) {
            addCriterion("LOC >", value, "loc");
            return (Criteria) this;
        }

        public Criteria andLocGreaterThanOrEqualTo(String value) {
            addCriterion("LOC >=", value, "loc");
            return (Criteria) this;
        }

        public Criteria andLocLessThan(String value) {
            addCriterion("LOC <", value, "loc");
            return (Criteria) this;
        }

        public Criteria andLocLessThanOrEqualTo(String value) {
            addCriterion("LOC <=", value, "loc");
            return (Criteria) this;
        }

        public Criteria andLocLike(String value) {
            addCriterion("LOC like", value, "loc");
            return (Criteria) this;
        }

        public Criteria andLocNotLike(String value) {
            addCriterion("LOC not like", value, "loc");
            return (Criteria) this;
        }

        public Criteria andLocIn(List<String> values) {
            addCriterion("LOC in", values, "loc");
            return (Criteria) this;
        }

        public Criteria andLocNotIn(List<String> values) {
            addCriterion("LOC not in", values, "loc");
            return (Criteria) this;
        }

        public Criteria andLocBetween(String value1, String value2) {
            addCriterion("LOC between", value1, value2, "loc");
            return (Criteria) this;
        }

        public Criteria andLocNotBetween(String value1, String value2) {
            addCriterion("LOC not between", value1, value2, "loc");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DEPT
     *
     * @mbg.generated do_not_delete_during_merge Thu May 16 21:51:42 EDT 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DEPT
     *
     * @mbg.generated Thu May 16 21:51:42 EDT 2019
     */
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