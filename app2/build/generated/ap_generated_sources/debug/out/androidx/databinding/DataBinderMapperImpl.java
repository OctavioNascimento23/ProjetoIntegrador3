package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.example.projetointegrador3.app2.DataBinderMapperImpl());
  }
}
