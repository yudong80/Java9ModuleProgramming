module javasort {
    requires sortutil;
    provides com.example.util.SortUtil with com.example.javasort.JavaSort;
}