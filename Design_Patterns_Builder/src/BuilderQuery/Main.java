package BuilderQuery;

public class Main {
    public static void main(String[] args) {
        QueryBuilder query = new QueryBuilder.Builder()
                .select("id, name, salary")
                .from("employees")
                .where("salary > 550000")
                .join("INNER JOIN departments ON employees.dept_id = departments.id")
                .groupBy("department")
                .orderBY("salary DESC")
                .build();

        System.out.println("Select "+ query.getSelect());
        System.out.println("FROM " + query.getFrom());
        System.out.println("WHERE " + query.getWhere());
        System.out.println("JOIN " + query.getJoin());
        System.out.println("GROUP BY " + query.getGroupBy());
        System.out.println("ORDER BY " + query.getOrderBy());
    }
}
