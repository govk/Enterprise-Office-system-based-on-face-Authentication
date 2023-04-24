<template>
	<div class="addEdit-block" :style='{"padding":"30px"}' style="width: 100%;">
		<el-form
			:style='{"padding":"30px","boxShadow":"0 0px 0px #999","borderRadius":"6px","background":"url(http://codegen.caihongy.cn/20221014/5e767dc0afa649ec9fbc71f9da086ab3.jpg)"}'
			class="add-update-preview"
			ref="ruleForm"
			:model="ruleForm"
			:rules="rules"
			label-width="80px"
		>
			<template >
				<el-form-item :style='{"margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="项目编号" prop="xiangmubianhao">
					<el-input v-model="ruleForm.xiangmubianhao" placeholder="项目编号" clearable  :readonly="ro.xiangmubianhao"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' v-else class="input" label="项目编号" prop="xiangmubianhao">
					<el-input v-model="ruleForm.xiangmubianhao" placeholder="项目编号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="项目名称" prop="xiangmumingcheng">
					<el-input v-model="ruleForm.xiangmumingcheng" placeholder="项目名称" clearable  :readonly="ro.xiangmumingcheng"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' v-else class="input" label="项目名称" prop="xiangmumingcheng">
					<el-input v-model="ruleForm.xiangmumingcheng" placeholder="项目名称" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="项目级别" prop="xiangmujibie">
					<el-input v-model="ruleForm.xiangmujibie" placeholder="项目级别" clearable  :readonly="ro.xiangmujibie"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' v-else class="input" label="项目级别" prop="xiangmujibie">
					<el-input v-model="ruleForm.xiangmujibie" placeholder="项目级别" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="项目分类" prop="xiangmufenlei">
					<el-input v-model="ruleForm.xiangmufenlei" placeholder="项目分类" clearable  :readonly="ro.xiangmufenlei"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' v-else class="input" label="项目分类" prop="xiangmufenlei">
					<el-input v-model="ruleForm.xiangmufenlei" placeholder="项目分类" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="项目子类" prop="xiangmuzilei">
					<el-input v-model="ruleForm.xiangmuzilei" placeholder="项目子类" clearable  :readonly="ro.xiangmuzilei"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' v-else class="input" label="项目子类" prop="xiangmuzilei">
					<el-input v-model="ruleForm.xiangmuzilei" placeholder="项目子类" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' class="select" v-if="type!='info'"  label="负责部门" prop="fuzebumen">
					<el-select :disabled="ro.fuzebumen" v-model="ruleForm.fuzebumen" placeholder="请选择负责部门" >
						<el-option
							v-for="(item,index) in fuzebumenOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' v-else class="input" label="负责部门" prop="fuzebumen">
					<el-input v-model="ruleForm.fuzebumen"
						placeholder="负责部门" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' class="date" v-if="type!='info'" label="立项时间" prop="lixiangshijian">
					<el-date-picker
						format="yyyy 年 MM 月 dd 日"
						value-format="yyyy-MM-dd"
						v-model="ruleForm.lixiangshijian" 
						type="date"
						:readonly="ro.lixiangshijian"
						placeholder="立项时间"
					></el-date-picker> 
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' class="input" v-else-if="ruleForm.lixiangshijian" label="立项时间" prop="lixiangshijian">
					<el-input v-model="ruleForm.lixiangshijian" placeholder="立项时间" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' class="date" v-if="type!='info'" label="结项时间" prop="jiexiangshijian">
					<el-date-picker
						format="yyyy 年 MM 月 dd 日"
						value-format="yyyy-MM-dd"
						v-model="ruleForm.jiexiangshijian" 
						type="date"
						:readonly="ro.jiexiangshijian"
						placeholder="结项时间"
					></el-date-picker> 
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' class="input" v-else-if="ruleForm.jiexiangshijian" label="结项时间" prop="jiexiangshijian">
					<el-input v-model="ruleForm.jiexiangshijian" placeholder="结项时间" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="批准号" prop="pizhunhao">
					<el-input v-model="ruleForm.pizhunhao" placeholder="批准号" clearable  :readonly="ro.pizhunhao"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' v-else class="input" label="批准号" prop="pizhunhao">
					<el-input v-model="ruleForm.pizhunhao" placeholder="批准号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' class="upload" v-if="type!='info'&& !ro.xiangguanfujian" label="相关附件" prop="xiangguanfujian">
					<file-upload
						tip="点击上传相关附件"
						action="file/upload"
						:limit="1"
						:multiple="true"
						:fileUrls="ruleForm.xiangguanfujian?ruleForm.xiangguanfujian:''"
						@change="xiangguanfujianUploadChange"
					></file-upload>
				</el-form-item>  
				<el-form-item :style='{"margin":"0 0 20px 0"}' v-else-if="ruleForm.xiangguanfujian" label="相关附件" prop="xiangguanfujian">
					<el-button :style='{"border":"1px solid #5e9808","cursor":"pointer","padding":"0 24px","margin":"0 20px 0 0","outline":"none","color":"#fff","borderRadius":"4px","background":"-webkit-linear-gradient(top,#96d148,#4a7f06)","width":"auto","lineHeight":"40px","fontSize":"14px","height":"40px"}' type="text" size="small" @click="download($base.url+ruleForm.xiangguanfujian)">下载</el-button>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' v-else-if="!ruleForm.xiangguanfujian" label="相关附件" prop="xiangguanfujian">
					<el-button :style='{"border":"1px solid #5e9808","cursor":"pointer","padding":"0 24px","margin":"0 20px 0 0","outline":"none","color":"#fff","borderRadius":"4px","background":"-webkit-linear-gradient(top,#96d148,#4a7f06)","width":"auto","lineHeight":"40px","fontSize":"14px","height":"40px"}' type="text" size="small">无</el-button>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="项目经费" prop="xiangmujingfei">
					<el-input v-model="ruleForm.xiangmujingfei" placeholder="项目经费" clearable  :readonly="ro.xiangmujingfei"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' v-else class="input" label="项目经费" prop="xiangmujingfei">
					<el-input v-model="ruleForm.xiangmujingfei" placeholder="项目经费" readonly></el-input>
				</el-form-item>
			</template>
				<el-form-item :style='{"margin":"0 0 20px 0"}' v-if="type!='info'"  label="参与人员" prop="canyurenyuan">
					<editor 
						style="min-width: 200px; max-width: 600px;"
						v-model="ruleForm.canyurenyuan" 
						class="editor" 
						action="file/upload">
					</editor>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' v-else-if="ruleForm.canyurenyuan" label="参与人员" prop="canyurenyuan">
                    <span :style='{"fontSize":"14px","lineHeight":"40px","color":"#00a9aa","fontWeight":"500","display":"inline-block"}' v-html="ruleForm.canyurenyuan"></span>
                </el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' v-if="type!='info'"  label="项目内容" prop="xiangmuneirong">
					<editor 
						style="min-width: 200px; max-width: 600px;"
						v-model="ruleForm.xiangmuneirong" 
						class="editor" 
						action="file/upload">
					</editor>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' v-else-if="ruleForm.xiangmuneirong" label="项目内容" prop="xiangmuneirong">
                    <span :style='{"fontSize":"14px","lineHeight":"40px","color":"#00a9aa","fontWeight":"500","display":"inline-block"}' v-html="ruleForm.xiangmuneirong"></span>
                </el-form-item>
			<el-form-item :style='{"padding":"0","margin":"0"}' class="btn">
				<el-button :style='{"border":"1px solid #5e9808","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"4px","background":"-webkit-linear-gradient(top,#96d148,#4a7f06)","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}'  v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
				<el-button :style='{"border":"1px solid #ccc","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#5b8020","borderRadius":"4px","background":"-webkit-linear-gradient(top,#fff,#ccc)","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
				<el-button :style='{"border":"1px solid #ccc","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#5b8020","borderRadius":"4px","background":"-webkit-linear-gradient(top,#fff,#ccc)","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
			</el-form-item>
		</el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
	data() {
		let self = this
		var validateIdCard = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!checkIdCard(value)) {
				callback(new Error("请输入正确的身份证号码"));
			} else {
				callback();
			}
		};
		var validateUrl = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isURL(value)) {
				callback(new Error("请输入正确的URL地址"));
			} else {
				callback();
			}
		};
		var validateMobile = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isMobile(value)) {
				callback(new Error("请输入正确的手机号码"));
			} else {
				callback();
			}
		};
		var validatePhone = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isPhone(value)) {
				callback(new Error("请输入正确的电话号码"));
			} else {
				callback();
			}
		};
		var validateEmail = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isEmail(value)) {
				callback(new Error("请输入正确的邮箱地址"));
			} else {
				callback();
			}
		};
		var validateNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isNumber(value)) {
				callback(new Error("请输入数字"));
			} else {
				callback();
			}
		};
		var validateIntNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isIntNumer(value)) {
				callback(new Error("请输入整数"));
			} else {
				callback();
			}
		};
		return {
			id: '',
			type: '',
			
			
			ro:{
				xiangmubianhao : false,
				xiangmumingcheng : false,
				xiangmujibie : false,
				xiangmufenlei : false,
				xiangmuzilei : false,
				fuzebumen : false,
				lixiangshijian : false,
				jiexiangshijian : false,
				pizhunhao : false,
				xiangguanfujian : false,
				xiangmujingfei : false,
				canyurenyuan : false,
				xiangmuneirong : false,
			},
			
			
			ruleForm: {
				xiangmubianhao: '',
				xiangmumingcheng: '',
				xiangmujibie: '',
				xiangmufenlei: '',
				xiangmuzilei: '',
				fuzebumen: '',
				lixiangshijian: '',
				jiexiangshijian: '',
				pizhunhao: '',
				xiangguanfujian: '',
				xiangmujingfei: '',
				canyurenyuan: '',
				xiangmuneirong: '',
			},
		
			fuzebumenOptions: [],
			
			rules: {
				xiangmubianhao: [
				],
				xiangmumingcheng: [
				],
				xiangmujibie: [
				],
				xiangmufenlei: [
				],
				xiangmuzilei: [
				],
				fuzebumen: [
				],
				lixiangshijian: [
				],
				jiexiangshijian: [
				],
				pizhunhao: [
				],
				xiangguanfujian: [
				],
				xiangmujingfei: [
					{ validator: validateNumber, trigger: 'blur' },
				],
				canyurenyuan: [
				],
				xiangmuneirong: [
				],
			}
		};
	},
	props: ["parent"],
	computed: {



	},
    components: {
    },
	created() {
	},
	methods: {
		
		// 下载
		download(file){
			window.open(`${file}`)
		},
		// 初始化
		init(id,type) {
			if (id) {
				this.id = id;
				this.type = type;
			}
			if(this.type=='info'||this.type=='else'){
				this.info(id);
			}else if(this.type=='logistics'){
				this.logistics=false;
				this.info(id);
			}else if(this.type=='cross'){
				var obj = this.$storage.getObj('crossObj');
				for (var o in obj){
						if(o=='xiangmubianhao'){
							this.ruleForm.xiangmubianhao = obj[o];
							this.ro.xiangmubianhao = true;
							continue;
						}
						if(o=='xiangmumingcheng'){
							this.ruleForm.xiangmumingcheng = obj[o];
							this.ro.xiangmumingcheng = true;
							continue;
						}
						if(o=='xiangmujibie'){
							this.ruleForm.xiangmujibie = obj[o];
							this.ro.xiangmujibie = true;
							continue;
						}
						if(o=='xiangmufenlei'){
							this.ruleForm.xiangmufenlei = obj[o];
							this.ro.xiangmufenlei = true;
							continue;
						}
						if(o=='xiangmuzilei'){
							this.ruleForm.xiangmuzilei = obj[o];
							this.ro.xiangmuzilei = true;
							continue;
						}
						if(o=='fuzebumen'){
							this.ruleForm.fuzebumen = obj[o];
							this.ro.fuzebumen = true;
							continue;
						}
						if(o=='lixiangshijian'){
							this.ruleForm.lixiangshijian = obj[o];
							this.ro.lixiangshijian = true;
							continue;
						}
						if(o=='jiexiangshijian'){
							this.ruleForm.jiexiangshijian = obj[o];
							this.ro.jiexiangshijian = true;
							continue;
						}
						if(o=='pizhunhao'){
							this.ruleForm.pizhunhao = obj[o];
							this.ro.pizhunhao = true;
							continue;
						}
						if(o=='xiangguanfujian'){
							this.ruleForm.xiangguanfujian = obj[o];
							this.ro.xiangguanfujian = true;
							continue;
						}
						if(o=='xiangmujingfei'){
							this.ruleForm.xiangmujingfei = obj[o];
							this.ro.xiangmujingfei = true;
							continue;
						}
						if(o=='canyurenyuan'){
							this.ruleForm.canyurenyuan = obj[o];
							this.ro.canyurenyuan = true;
							continue;
						}
						if(o=='xiangmuneirong'){
							this.ruleForm.xiangmuneirong = obj[o];
							this.ro.xiangmuneirong = true;
							continue;
						}
				}
				













			}
			
			
			// 获取用户信息
			this.$http({
				url: `${this.$storage.get('sessionTable')}/session`,
				method: "get"
			}).then(({ data }) => {
				if (data && data.code === 0) {
					
					var json = data.data;
				} else {
					this.$message.error(data.msg);
				}
			});
			
            this.$http({
				url: `option/bumen/bumen`,
				method: "get"
            }).then(({ data }) => {
				if (data && data.code === 0) {
					this.fuzebumenOptions = data.data;
				} else {
					this.$message.error(data.msg);
				}
            });
			
		},
    // 多级联动参数

    info(id) {
      this.$http({
        url: `qiyexiangmu/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
        //解决前台上传图片后台不显示的问题
        let reg=new RegExp('../../../upload','g')//g代表全部
        this.ruleForm.canyurenyuan = this.ruleForm.canyurenyuan.replace(reg,'../../../ssm4xo2n/upload');
        this.ruleForm.xiangmuneirong = this.ruleForm.xiangmuneirong.replace(reg,'../../../ssm4xo2n/upload');
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {




















	if(this.ruleForm.xiangguanfujian!=null) {
		this.ruleForm.xiangguanfujian = this.ruleForm.xiangguanfujian.replace(new RegExp(this.$base.url,"g"),"");
	}







var objcross = this.$storage.getObj('crossObj');

      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(statusColumnName && !statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
       this.$refs["ruleForm"].validate(valid => {
         if (valid) {
		 if(crossrefid && crossuserid) {
			 this.ruleForm.crossuserid = crossuserid;
			 this.ruleForm.crossrefid = crossrefid;
			let params = { 
				page: 1, 
				limit: 10, 
				crossuserid:this.ruleForm.crossuserid,
				crossrefid:this.ruleForm.crossrefid,
			} 
			this.$http({ 
				url: "qiyexiangmu/page", 
				method: "get", 
				params: params 
			}).then(({ 
				data 
			}) => { 
				if (data && data.code === 0) { 
				       if(data.data.total>=crossoptnum) {
					     this.$message.error(this.$storage.get('tips'));
					       return false;
				       } else {
					 this.$http({
					   url: `qiyexiangmu/${!this.ruleForm.id ? "save" : "update"}`,
					   method: "post",
					   data: this.ruleForm
					 }).then(({ data }) => {
					   if (data && data.code === 0) {
					     this.$message({
					       message: "操作成功",
					       type: "success",
					       duration: 1500,
					       onClose: () => {
						 this.parent.showFlag = true;
						 this.parent.addOrUpdateFlag = false;
						 this.parent.qiyexiangmuCrossAddOrUpdateFlag = false;
						 this.parent.search();
						 this.parent.contentStyleChange();
					       }
					     });
					   } else {
					     this.$message.error(data.msg);
					   }
					 });

				       }
				} else { 
				} 
			});
		 } else {
			 this.$http({
			   url: `qiyexiangmu/${!this.ruleForm.id ? "save" : "update"}`,
			   method: "post",
			   data: this.ruleForm
			 }).then(({ data }) => {
			   if (data && data.code === 0) {
			     this.$message({
			       message: "操作成功",
			       type: "success",
			       duration: 1500,
			       onClose: () => {
				 this.parent.showFlag = true;
				 this.parent.addOrUpdateFlag = false;
				 this.parent.qiyexiangmuCrossAddOrUpdateFlag = false;
				 this.parent.search();
				 this.parent.contentStyleChange();
			       }
			     });
			   } else {
			     this.$message.error(data.msg);
			   }
			 });
		 }
         }
       });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.qiyexiangmuCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    xiangguanfujianUploadChange(fileUrls) {
	    this.ruleForm.xiangguanfujian = fileUrls;
    },
  }
};
</script>
<style lang="scss" scoped>
	.amap-wrapper {
		width: 100%;
		height: 500px;
	}
	
	.search-box {
		position: absolute;
	}
	
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  	  padding: 0 10px 0 0;
	  	  text-shadow: 0 1px 10px #fff;
	  	  color: #699620;
	  	  width: 80px;
	  	  font-size: 14px;
	  	  line-height: 40px;
	  	  text-align: right;
	  	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 80px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  	  border: 0;
	  	  border-radius: 4px;
	  	  padding: 0 12px;
	  	  box-shadow: 0 0 1px #4b681d;
	  	  outline: none;
	  	  color: #00a9aa;
	  	  width: 400px;
	  	  font-size: 14px;
	  	  height: 40px;
	  	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  	  border: 0;
	  	  border-radius: 4px;
	  	  padding: 0 10px;
	  	  box-shadow: 0 0 1px #4b681d;
	  	  outline: none;
	  	  color: #00a9aa;
	  	  width: 200px;
	  	  font-size: 14px;
	  	  height: 40px;
	  	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  	  border: 0;
	  	  border-radius: 4px;
	  	  padding: 0 10px 0 30px;
	  	  box-shadow: 0 0 1px #4b681d;
	  	  outline: none;
	  	  color: #00a9aa;
	  	  width: 200px;
	  	  font-size: 14px;
	  	  height: 40px;
	  	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  	  border: 1px dashed #fff;
	  	  cursor: pointer;
	  	  border-radius: 6px;
	  	  color: #fff;
	  	  width: 200px;
	  	  font-size: 32px;
	  	  line-height: 100px;
	  	  text-align: center;
	  	  height: 100px;
	  	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  	  border: 1px dashed #fff;
	  	  cursor: pointer;
	  	  border-radius: 6px;
	  	  color: #fff;
	  	  width: 200px;
	  	  font-size: 32px;
	  	  line-height: 100px;
	  	  text-align: center;
	  	  height: 100px;
	  	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  	  border: 1px dashed #fff;
	  	  cursor: pointer;
	  	  border-radius: 6px;
	  	  color: #fff;
	  	  width: 200px;
	  	  font-size: 32px;
	  	  line-height: 100px;
	  	  text-align: center;
	  	  height: 100px;
	  	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  	  border: 0;
	  	  border-radius: 4px;
	  	  padding: 12px;
	  	  box-shadow: 0 0 1px #4b681d;
	  	  outline: none;
	  	  color: #00a9aa;
	  	  width: 400px;
	  	  font-size: 14px;
	  	  height: auto;
	  	}
</style>
