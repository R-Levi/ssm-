package com.levi.web.mapper;

import com.levi.web.model.Borrow;
import com.levi.web.model.BorrowExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BorrowMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow
     *
     * @mbg.generated Sat Mar 28 14:18:29 CST 2020
     */
    long countByExample(BorrowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow
     *
     * @mbg.generated Sat Mar 28 14:18:29 CST 2020
     */
    int deleteByExample(BorrowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow
     *
     * @mbg.generated Sat Mar 28 14:18:29 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow
     *
     * @mbg.generated Sat Mar 28 14:18:29 CST 2020
     */
    int insert(Borrow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow
     *
     * @mbg.generated Sat Mar 28 14:18:29 CST 2020
     */
    int insertSelective(Borrow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow
     *
     * @mbg.generated Sat Mar 28 14:18:29 CST 2020
     */
    List<Borrow> selectByExample(BorrowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow
     *
     * @mbg.generated Sat Mar 28 14:18:29 CST 2020
     */
    Borrow selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow
     *
     * @mbg.generated Sat Mar 28 14:18:29 CST 2020
     */
    int updateByExampleSelective(@Param("record") Borrow record, @Param("example") BorrowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow
     *
     * @mbg.generated Sat Mar 28 14:18:29 CST 2020
     */
    int updateByExample(@Param("record") Borrow record, @Param("example") BorrowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow
     *
     * @mbg.generated Sat Mar 28 14:18:29 CST 2020
     */
    int updateByPrimaryKeySelective(Borrow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow
     *
     * @mbg.generated Sat Mar 28 14:18:29 CST 2020
     */
    int updateByPrimaryKey(Borrow record);
}