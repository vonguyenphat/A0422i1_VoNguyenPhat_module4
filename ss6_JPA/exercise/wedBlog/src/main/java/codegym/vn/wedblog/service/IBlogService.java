package codegym.vn.wedblog.service;

import codegym.vn.wedblog.bean.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> getAll();
    void save(Blog blog);
    void update(int id,Blog blog);
    Blog findByIdMy(int id);
    void deleteById(int id);
}
