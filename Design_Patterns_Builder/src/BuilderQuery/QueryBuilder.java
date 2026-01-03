package BuilderQuery;

public class QueryBuilder {
    private String select;
    private String from;
    private  String where;
    private String join;
    private String orderBy;
    private String groupBy;

    public static Builder builder() {
        return  new Builder();
    }

    public String getSelect() {
        return select;
    }

    public String getFrom() {
        return from;
    }

    public String getWhere() {
        return where;
    }

    public String getJoin() {
        return join;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public String getGroupBy() {
        return groupBy;
    }

    public  static class Builder {
        private QueryBuilder queryBuilder;
        public Builder() {
            queryBuilder = new QueryBuilder();
        }

        public Builder select(String select) {
            queryBuilder.select = select;
            return this;
        }
        public Builder from(String from) {
            queryBuilder.from = from;
            return this;
        }

        public Builder where(String where) {
            queryBuilder.where = where;
            return this;
        }
        public Builder join(String join) {
            queryBuilder.join = join;
            return this;
        }
        public Builder orderBY(String orderBy) {
            queryBuilder.orderBy = orderBy;
            return this;
        }

        public Builder groupBy(String groupBy) {
            queryBuilder.groupBy = groupBy;
            return this;
        }

        public QueryBuilder build() {
            QueryBuilder queryBuilder = new QueryBuilder();
            queryBuilder.select = this.queryBuilder.select;
            queryBuilder.from = this.queryBuilder.from;
            queryBuilder.where = this.queryBuilder.where;
            queryBuilder.join = this.queryBuilder.join;
            queryBuilder.orderBy = this.queryBuilder.orderBy;
            queryBuilder.groupBy = this.queryBuilder.groupBy;
            return queryBuilder;
        }
    }

}
