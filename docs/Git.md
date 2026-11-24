
targetディレクトリは管理する必要がなさそうなので管理対象から外した。

方法
1. gitignoreにtarget/を追記
```gitignore
target/
```
1. git rm -f --cached target/を実行
```bash
git rm -f --cached target/
```

3. コミット
```bash
git add .gitignore
git commit -m "Stop tracking target directory"
git push
```